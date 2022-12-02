public class HeaqQuiz {
	int id = 0;
	public static void main(String[] args) {
		int x = 0;
		HeaqQuiz [] hq = new HeaqQuiz [5];
		while(x<3) {
			hq[x] = new HeaqQuiz();
			hq[x].id = x;
			x = x +1;
		}
	
	hq[3] = hq[1]; //hq[3] apunta a hq[1] con valor "id=0"
	hq[4] = hq[1]; //hq[4] apunta a hq[1] con valor "id=0"
	hq[3] = null; //hq[3] apunta a null su valor es "null"
	hq[4] = hq[0]; //hq[4] apunta a hq[0] con valor "id=0"
	hq[0] = hq[3]; //hq[0] apunta a hq[3] con valor "null"
	hq[3] = hq[2]; // hq[3] apunta a hq [2] con valor "id=1"
	hq[2] = hq[0]; // hq[2] apunta a hq[0] con valor "null"
	// do stuff
	}
}
