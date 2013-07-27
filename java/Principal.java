import javax.swing.*;
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String menu = new String();
		int menuExit = 0, op = 0;
		menu = "Digite o número da questão que deseja acessar:\n1 - Questão Telefone" +
				"\n4 - Questão Bits Trocados\n5 - Questão Conta de Água" +
				"\n7 - Questão Peça Perdida\n9 - Desafio Projeto Genoma\n0 - Sair";
		do{
			op = getInteger(showInput(menu));
			switch(op){
				default:
					op = menuExit;
					break;
				case 1:
					QuestaoTelefone q = new QuestaoTelefone();
					q.setTelefone("55-98-234-5678");
					showMessage(q.getResult());
					q.setTelefone("0800-FALE-SBC");
					showMessage(q.getResult());
					q.setTelefone("M1S-TU-R4");
					showMessage(q.getResult());
					break;
				case 2://Mini-Calculadora
					break;
				case 4://Bits-Trocados
					QuestaoBitsTrocados q4 = new QuestaoBitsTrocados();
					q4.setValorCliente(1);
					showMessage(q4.getResult());
					q4.setValorCliente(72);
					showMessage(q4.getResult());
					q4.setValorCliente(150);
					showMessage(q4.getResult());
					break;
				case 5:
					QuestaoContaAgua q5 = new QuestaoContaAgua();
					q5.setQtdConsumo(8);
					showMessage(q5.getResult());
					q5.setQtdConsumo(14);
					showMessage(q5.getResult());
					q5.setQtdConsumo(42);
					showMessage(q5.getResult());
					q5.setQtdConsumo(120);
					showMessage(q5.getResult());
					break;
				case 7://Peça Perdida
					QuestaoPecaPerdida q7 = new QuestaoPecaPerdida();
					q7.setTeste(3, "3 1");
					showMessage(q7.getResult());
					q7.setTeste(5, "1 2 3 5");
					showMessage(q7.getResult());
					q7.setTeste(4, "2 4 3");
					showMessage(q7.getResult());
					break;
				case 9://Desafio: Projeto Genoma
					QuestaoProjetoGenoma q9 = new QuestaoProjetoGenoma();
					q9.setTamanhoCadeias(2, 4);
					q9.setCadeiaP("AC");
					q9.setCadeiaT("TGGT");
					showMessage(q9.getResult());
					
					q9.setTamanhoCadeias(4, 25);
					q9.setCadeiaP("CATA");
					q9.setCadeiaT("TCATATGCAAATAGCTGCATACCGA");
					showMessage(q9.getResult());
					break;
			}//END SWITCH
		}while(op!=menuExit);
	}//END FUNCTION
	
	public static String showInput(String str){
		return JOptionPane.showInputDialog(str);
	}//END FUNCTION
	
	public static void showMessage(int n){
		JOptionPane.showMessageDialog(null, n);
	}//END FUNCTION
	
	public static void showMessage(String str){
		JOptionPane.showMessageDialog(null, str);
	}//END FUNCTION
	
	public static void consoleLog(String str){
		System.out.println(str);
	}//END FUNCTION
	
	public static int getInteger(String str){
		try{
			return Integer.parseInt(str);
		}catch(Exception e){
			return 0;
		}//END TRY_CATCH
	}//END FUNCTION;
}//END CLASS