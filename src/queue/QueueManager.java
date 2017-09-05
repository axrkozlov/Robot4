package queue;

public class QueueManager {
    
    public static void main(String[] args) {    
        
        
        Queue queue=new Queue();
        //String queuestring=new String();
        for(int i=0;i<10;i++){
            String queuestring="String N";
            queue.push(queuestring+i);
        }
        
        
        //while (queue.getSize()>0){
            //System.out.println((String)queue.pull());
            //System.out.println("Left in queue:"+queue.getSize());
            //String queuestring1=new String();
        //    queue.pull();
        //}
       //System.out.println(queue.get(2));
        while (queue.getSize()>0){
            //System.out.println((String)queue.pull());
            //System.out.println("Left in queue:"+queue.getSize());
            //String queuestring1=new String();
            queue.pulllast();
        }        
        
    }
}
