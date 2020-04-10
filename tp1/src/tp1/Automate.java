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
		for(int i = 0; i < w.length(); i++) {
			char c = w.charAt(i);
			System.out.println("State -> "+state+" Entrée -> "+c);
			nextState(c);
		}
		System.out.println("-> State "+state);
		return isCurrentStateAcceptable();
	}
	
	public void nextState(char c) {
		switch(c) {
			case 0:
				if(c == 'a')
					state = 1;
				else state = -1;
				break;
			case 1:
				if(c == 'b')
					state = 2;
				else state = -1;
				break;
			default:
				state = -1;
		}
	}
}
