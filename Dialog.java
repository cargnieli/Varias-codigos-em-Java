import javax.swing.JOptionPane;
	public class Dialog {
		
		public static void main(String[] args){
			
			int _resultado = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "SAIDA", JOptionPane.YES_NO_OPTION);
			
			if(_resultado == JOptionPane.YES_OPTION){
				System.out.println("Usuario confirmou a saida");
				}else{
					System.out.println("Usuario nao confirmou a saida");
		
					
					
				}
		}
		
		
		
		
	}