import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BemVindoApp extends JFrame implements ActionListener {
    private JTextField campoTexto;  // Campo para inserir o nome
    private JButton botaoConfirmar; // Botão para confirmar
    private JLabel etiquetaSaudacao; // Etiqueta para exibir a mensagem

    public BemVindoApp() {
        super("Bem-vindo App"); // Título da janela
        
        // Configurando o layout da janela
        setLayout(new FlowLayout());
        
        // Criando os elementos gráficos
        JLabel etiquetaInstrucoes = new JLabel("Digite seu nome:");
        campoTexto = new JTextField(15); // Campo de texto com largura 15
        botaoConfirmar = new JButton("Confirmar");
        etiquetaSaudacao = new JLabel(""); // Etiqueta inicialmente vazia
        
        // Registrando o listener ao botão
        botaoConfirmar.addActionListener(this);
        
        // Adicionando os elementos na janela
        add(etiquetaInstrucoes);
        add(campoTexto);
        add(botaoConfirmar);
        add(etiquetaSaudacao);
        
        // Configurações finais da janela
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoConfirmar) {
            String nome = campoTexto.getText(); // Obtendo o texto do campo
            etiquetaSaudacao.setText("Bem-vindo, " + nome + "!"); // Atualizando a etiqueta
        }
    }
    
    public static void main(String[] args) {
        new BemVindoApp(); // Executa o aplicativo
    }
}
