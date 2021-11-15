
    

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cadastro extends JFrame implements ActionListener  {

    JTextField nome, email, senha;
    JLabel titulo,lblNome, lblEmail,lblSenha, sexo, estiloLeitura, timeFootball;
    JRadioButton masculino, feminino;
    JCheckBox esportes, edu, culinaria;
    JComboBox timeNOme;
    JButton envia;

    GridBagConstraints gbc = new GridBagConstraints();

    cadastro(){
        super("Cadastro de Clientes");

        // vetor String, servira de parametro para o JComboBox
        String [] times = {"L.A Lakers", "Brooklyn Nets", "Golden State Warrios"};

        Container c = getContentPane();
        c.setLayout(new GridLayout(9, 6,10,10));

        ButtonGroup grupo = new ButtonGroup();

        nome  = new JTextField();
        email = new JTextField();
        senha = new JTextField();

        titulo = new JLabel("Cadastro de clientes");
        sexo  = new JLabel("Sexo:");
        estiloLeitura = new JLabel("Estilo de leitura:");
        timeFootball = new JLabel("Time de football:");
        lblEmail = new JLabel("Email: ");
        lblNome = new JLabel("Nome: ");
        lblSenha = new JLabel("Senha: ");

        masculino = new JRadioButton("Masculino");
        feminino = new JRadioButton("Feminino");

        esportes = new JCheckBox("Esportes");
        edu = new JCheckBox("Educação");
        culinaria = new JCheckBox("Culiniária");

        timeNOme = new JComboBox(times);

        envia = new JButton("Envia");

        titulo.setBounds(150,10,300,50);
        titulo.setFont(new Font("Sans", Font.BOLD,16));

        // 1 linha
        nome.setBounds(170,70,150,25);
        lblNome.setBounds(130,70,150,25);
        lblNome.setFont(new Font(null, Font.ITALIC,12));

        // 2 linha
        email.setBounds(170,110,150,25);
        lblEmail.setBounds(130,110,150,25);
        lblEmail.setFont(new Font(null, Font.ITALIC,12));

        // 3 linha
        senha.setBounds(170,150,150,25);
        lblSenha.setBounds(130,150,150,25);
        lblSenha.setFont(new Font(null, Font.ITALIC,12));

        // 4 linha
        sexo.setBounds(130,190,160,25);
        sexo.setFont(new Font(null, Font.ITALIC,12));
        masculino.setBounds(190,190,170,25);
        feminino.setBounds(190,210,170,25);

        // 5 linha
        estiloLeitura.setBounds(90,250,160,25);
        estiloLeitura.setFont(new Font(null, Font.ITALIC,12));

        esportes.setBounds(190,250,170,25);

        edu.setBounds(190,270,170,25);

        culinaria.setBounds(190,290,170,25);

        // 6 linha

        timeFootball.setBounds(90,350,160,25);
        timeFootball.setFont(new Font(null, Font.ITALIC,12));

        timeNOme.setBounds(190,350,160,25);


        //enviar
        envia.setBounds(190,400,90,25);

        envia.addActionListener(this);

        setVisible(true);
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(null);

        add(nome);
        add(senha);
        add(email);

        add(lblEmail);
        add(lblSenha);
        add(lblNome);

        add(titulo);
        add(sexo);
        add(masculino);
        grupo.add(masculino);
        add(feminino);
        grupo.add(feminino);

        add(estiloLeitura);
        add(esportes);
        add(edu);
        add(culinaria);

        add(timeFootball);
        add(timeNOme);

        add(envia);

        envia.addActionListener(this);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == envia){
            nome.setText("");
            email.setText("");
            senha.setText("");
            

        }

    }
}


