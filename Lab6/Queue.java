public class Queue {

    private int size;
    private int[] elements ;
    private int last;

    public Queue()
    {
        this.size = 8;
        this.elements = new int[size];
        this.last = 0;
    }

    public void enqueue(int v)
    {
        int[] newQueue = new int[size*2];
        for(int i = 0;i < size;i++)
        {
            newQueue[i] = elements[i];
        }

        elements = newQueue;
        elements[last] = v;
        last++;
        
        if(elements.length >= size)
        {
            size *= 2;
        }
        
    }

    public int dequeue()
    {
        int firstElement = this.elements[0];
        for(int i = 0; i < this.size-1;i++)
        {
            elements[i] = elements[i+1];
        }


        return firstElement;      
    }

    public boolean empty()
    {
        if(this.elements.length == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int getSize() 
    {
        return size;
    }

    public int[] getElements() {
        return elements;
    }


}
