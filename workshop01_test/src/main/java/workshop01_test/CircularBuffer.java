package workshop01_test;

public class CircularBuffer {

	private String[] buffer;
	private int writePointer;
	private int readPointer;
	
	public CircularBuffer(int size){
		setSize(size);
	}

	public void add(String input) {
		if( isFull() ){
			throw new BufferFullException();
		}
		this.buffer[writePointer++] = input;
		writePointer = (writePointer == buffer.length) ? 0 : writePointer;
	}

	public String read() {
		if( isEmpty() ){
			throw new BufferEmptyException();
		}
		return buffer[readPointer++];
	}

	public boolean isFull() {
		return buffer[writePointer] != null;
	}

	public boolean isEmpty() {
		return buffer[readPointer] == null;
	}

	public int getSize() {
		return buffer.length;
	}

	public void setSize(int size) {
		buffer = new String[size];
	}

}
