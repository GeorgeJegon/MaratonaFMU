
public class QuestaoBitsTrocados {
	private int valorCliente=0, valorTroco=0;

	public int getValorCliente() {
		return valorCliente;
	}//END FUNCTION

	public void setValorCliente(int valorCliente) {
		this.valorCliente = valorCliente;
	}//END FUNCTION
	
	public String getResult(){
		String display = new String();
		int n = 0;
		display = "";
		if(this.valorCliente>0){
			this.valorTroco = this.valorCliente;
			if(this.valorTroco>=50){
				n = (int)(this.valorTroco/50);
				this.valorTroco-= n*50;
			}//END IF
			display += n+" ";
			n = 0;
			if(this.valorTroco>=10){
				n = (int)(this.valorTroco/10);
				this.valorTroco-= n*10;
			}//END IF
			display += n+" ";
			n = 0;
			if(this.valorTroco>=5){
				n = (int)(this.valorTroco/5);
				this.valorTroco-= n*5;
			}//END IF
			display += n+" ";
			n = 0;
			if(this.valorTroco>=1){
				n = (int)(this.valorTroco/1);
				this.valorTroco-= n;
			}//END IF
			display += n;
		}//END IF
		return display;
	}//END FUNCTION
	
}//END CLASS
