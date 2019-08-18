package Pilha;

public class Pilha {
    public Object pilha[];
    public int position;
	private Object[] novoArray;
    
    public Pilha() {
        this.pilha = new Object[5];
        this.position = -1;
    }

    public boolean isEmpty(){       
        if(this.position == -1) {
        	return true;
        }
        return false;
    }   
   
    
    public void push(Object elemento){
        if(this.position == pilha.length - 1){
           novoArray = new Object[this.pilha.length * 2];
           for (int i = 0; i < pilha.length; i++) {
        	   this.novoArray[i] = this.pilha[i];
           }
           this.pilha = this.novoArray;
        }
           this.pilha[++position] = elemento;
    }
    
    public Object pop() throws ExEmpty {
      if(isEmpty()){
          throw new ExEmpty("Pilha vazia");
      }
      else{
          return this.pilha[this.position--];
      }
    }
    
    public Object top() throws ExEmpty {
    	if (isEmpty()) {
    		throw new ExEmpty("Pilha vazia");
    	}
        return this.pilha[this.position];
    }
    
    public Object size(){
        if (isEmpty()){
            return 0;
        }
    return this.position + 1;
    }
       
}
