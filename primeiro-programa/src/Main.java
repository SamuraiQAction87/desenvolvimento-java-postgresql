import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        /* CONSTRUINDO JANELA */
        JFrame janela = new JFrame();
        // Configurando o título da janela:
        janela.setTitle("meu primeiro Programa!");
        // Configurando o tamanho da janela:
        janela.setSize(500, 500);
        // Configurando o comportamento ao fechar a janela:
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /* CRIANDO COMPONENTES */
        // 'JLabel' é usado no Java Swing para exibir textos fixos ou rótulos na tela
        // (como o rótulo que fica ao lado ou acima de um campo de digitação).
        // 1º COMPONETE: Cria (instancia) um novo objeto visual do tipo JLabel com o texto "Nome:":
        JLabel labelNome = new JLabel("Nome:");
        // Define a posição (coordenadas) e as dimensões (largura e altura) do componente na janela:
        labelNome.setBounds(20, 20, 50, 20);

        // 2º COMPONETE: Criando instancia do objeto campo de texto:
        JTextField campoTextoNome = new JTextField();
        // Redimensionando o campo:
        campoTextoNome.setBounds(20, 40, 200, 20);

        // 3º COMPONETE: Criando botão:
        JButton botaoEnviar = new JButton("Enviar");
        botaoEnviar.setBounds(20,60,100,20);
        // Adicionando ação ao botão com Lambda:
        botaoEnviar.addActionListener(event -> {
            String nomeDigitado = campoTextoNome.getText();
            JOptionPane.showMessageDialog(janela, "Seja bem-vindo, " + nomeDigitado + "!");
        });

        /* LIMPANDO LAYOUT, INSERINDO COMPONENTES NA JANELA */
        // Desativando o layout padrão do getContentPane():
        janela.setLayout(null);
        /* getContentPane(): Acessa o painel de conteúdo (content pane) da janela.
         * No Java Swing, por padrão, os componentes visuais são inseridos dentro desse painel interno do frame.
         * Adicionando o label dentro da janela:
         * */
        janela.getContentPane().add(labelNome);
        // Adicionando o campo de texto ao painel da Janela:
        janela.getContentPane().add(campoTextoNome);
        // Adicionando o botão 'Enviar' ao painel da Janela:
        janela.getContentPane().add(botaoEnviar);

        // Afirmando que a janela será visível:
        janela.setVisible(true);
    }
}



















