package basic;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class cardLayout implements ActionListener{
	//criamos um JFrame chamado "janela"
	
	JFrame janela = new JFrame();
	//criamos um JPanel chamado "painel1"
	JPanel painel1 = new JPanel();
	//criamos um JPanel chamado "painel2"
	JPanel painel2 = new JPanel();
	//criamos um JLabel chamado "rotulo1"
	JLabel rotulo1 = new JLabel("Painel 1", JLabel.CENTER);
	//criamos um JLabel chamado "rotulo2"
	JLabel rotulo2 = new JLabel("Painel 2", JLabel.CENTER);
	//criamos dois botoes e um painel para alternar entre os paineis
	JPanel painelSelecao = new JPanel();
	JButton botao1 = new JButton("Painel 1");
	JButton botao2 = new JButton("Painel 2");
	//criamos o painelCard que sera gereciado pelo CardLayout
	JPanel painelCard = new JPanel();
	


	public static void main(String[] args) {	
			    		
		new cardLayout();
		
	}
	
	private cardLayout () {
		janela.setTitle("Exemplo de um CardLayout");
		janela.setSize(300, 200);
		janela.setLocation(50, 50);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLayout(new BorderLayout());
		painelSelecao.setLayout(new GridLayout(1,2));
		painelSelecao.add(botao1);
		painelSelecao.add(botao2);
		painel1.add(rotulo1);
		painel2.add(rotulo2);
		painelCard.setLayout(new CardLayout());
		painelCard.add(painel1, "p1" );
		painelCard.add(painel2, "p2");
		
		janela.add("North",painelSelecao);
		janela.add("East",painelCard);
	    botao1.addActionListener(this);
	    botao2.addActionListener(this);
	    janela.setVisible(true);
	}
	
			@Override
			public void actionPerformed(ActionEvent e) {
			
			CardLayout cl = (CardLayout) painelCard.getLayout();
			if (e.getSource() == botao1) {
				cl.show(painelCard, "p1");
			}
			if (e.getSource() == botao2) {
				cl.show(painelCard, "p2");
			}
			
			}
			

}
