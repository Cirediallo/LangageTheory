/**
 * 
 */
package tp1;

/**
 * @author satsuroki
 *
 */
public class Automate {
	private int state; 
	
	public Automate() {}
	
	// Initialize the state
	public void initState() {state = 0;}
	
	public boolean isCurrentStateAcceptable() {return state == 2;}
	
	// Is the word reconizable by the automaton
	public boolean isWordReconizable(String w) {
		initState();
		
		for (int i = 0; i < w.length(); i++) {
            char c = w.charAt(i);
            System.out.println("State : "+ state + " Character: " + c);
            nextState(c, state);
            System.out.println("After nextstate() "+state);
        }
		System.out.println("-> State at the end: "+state);
		return isCurrentStateAcceptable();
	}
	
	//move to the next State
	public void nextState(char c, int state) {
		switch(state) {
			case 0:
				if(c == 'a')
					state = 1;
				else
					state = -1;
				break;
			case 1:
				if(c == 'b') state = 2;
				else state = -1;
				break;
			default:
				state = -1;
				break;
		}
		
	}
	
	public static void main(String args[]) {
		Automate A =  new Automate();
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			boolean isReconizable = A.isWordReconizable(arg);
			if(isReconizable) {
				System.out.println("The word "+arg+" is reconizable");
			}else {
				System.out.println("The word "+arg+" is not reconizable");
			}
		}
	}
}
