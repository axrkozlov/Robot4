
package queue;

public class Queue {

    /**
     * @param args the command line arguments
     */
    private int size=0;
    private ObjectBox ob=null;
    private ObjectBox head=null;
    private ObjectBox tail=null;
        // TODO code application logic here
        public void push(Object anyobj) {
            ob=new ObjectBox();
            if(head==null){
                head=ob;
            }
            else {
                tail.setNextObject(ob);
                ob.setPrevObject(tail);
            }
            ob.setObject(anyobj);
            tail=ob;
            size++;
            //System.out.println((String)anyobj+"; Added:"+size);
        }
        public Object pull(){
            if (size==0){
                return null;
            }
            if (head==null){
                tail=null;
            }
            
            Object pullobj=head.getObject();
            head=head.getNextObject();
            
            size--;
            //System.out.println((String)pullobj+"; Left:"+size);
            return pullobj;
            
        }
        public Object pulllast(){
            if (size==0){
                return null;
            }
            if (head==null){
                tail=null;
            }
            
            Object pullobj=tail.getObject();
            tail=tail.getPrevObject();
            
            size--;
            System.out.println((String)pullobj+"; Left:"+size);
            return pullobj;
            
        }
        
        public Object get(int index){
            if (size==0 || index<0 || index>=size){
                return null;
            }
            ObjectBox temp1=head;
            ObjectBox temp2=tail;
            Object temp3=null;
            int pos=0;
            int posbackw=size-1;
            boolean seek=true;
            while (seek){
                
                temp1=temp1.getNextObject();
                temp2=temp2.getPrevObject();
                System.out.println("Seeking Pos:"+pos++);
                System.out.println("Seeking Back Pos:"+posbackw--);
                if (pos==index){
                    temp3= temp1.getObject();seek=false;
                } else if(posbackw==index){
                    temp3= temp2.getObject();seek=false;
                }
            }
            return temp3;
        }
        
        public int getSize(){
            return size;
        }
                

    
    
}
