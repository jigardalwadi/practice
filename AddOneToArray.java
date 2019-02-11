
public class AddOneToArray {

	public int[] add(int[] arr) {
		int len = arr.length-1;
		for(int i = len;i>=0;i--) {
			if(arr[i]<9) {
				arr[i]++;
				return arr;
			}
			arr[i] = 0;
		}
		int[] newNumber = new int [len+2];
	    newNumber[0] = 1;

	    return newNumber;
	}

	public static void main(String[] args) {
		int[] nums = new int[] {9,9,9};
		AddOneToArray AddOneToArray = new AddOneToArray();
		int[] out =  AddOneToArray.add(nums);
		for(int i : out) {
			System.out.println(i);
		}

	}

}
