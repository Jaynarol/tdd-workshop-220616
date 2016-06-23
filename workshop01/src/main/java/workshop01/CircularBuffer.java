package workshop01;

public class CircularBuffer {
	
	private int size = 0;
	@SuppressWarnings("unused")
	private boolean mode =false; 
	private String[] buffer;
	private int readpointer = 0;
	private int writepointer = 0;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CircularBuffer cbuffer = new CircularBuffer(8, true);
		System.out.println(cbuffer.isEmpty());
		cbuffer.add("A");
		cbuffer.add("B");
		cbuffer.add("C");
		cbuffer.add("D");
		System.out.println(cbuffer.read());
		System.out.println(cbuffer.read());
		System.out.println(cbuffer.read());
		System.out.println(cbuffer.read());
		
	}
	
	public CircularBuffer(int size, boolean mode){
		this.size = size;
		this.mode = mode;
		buffer = new String[size];
	}
	
	public void add(String word){
		buffer[writepointer] = word;
		writepointer++;
		if( writepointer >= size ){
			writepointer = 0;
			readpointer++;
		}
	}
	
	public String read() throws Exception{
		if(this.isEmpty()){
			throw new Exception();
		}
		
		String output = buffer[readpointer];
		buffer[readpointer] = null;
		readpointer++;
		
		if( readpointer >= size ){
			readpointer = 0;
		}
		
		return output;
	}
	
	public int getSize(){
		
		return 0;
	}
	
	public void setSize(int size){
		
	}
	
	public boolean isFull(){
		
		return buffer[writepointer] != null;
	}
	
	public boolean isEmpty(){
		
		return buffer[readpointer] == null;
	}
	
	public boolean mode(){
		
		return false;
	}
	
	
}
