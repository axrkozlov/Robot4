/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author udafk
 */
public class ObjectBox {
    
    private Object object=null;
    private ObjectBox ObjectNext=null;
    private ObjectBox ObjectPrev=null;
    //Object ObjectBox(Object object){
    //    this.object=object;
    //}
    public Object getObject(){
        return object;
    }
    public ObjectBox getNextObject(){
        return ObjectNext;
    }
    public ObjectBox getPrevObject(){
        return ObjectPrev;
    }
    public void setObject(Object object){
        this.object=object;
    }
    public void setNextObject(ObjectBox nextobject){
        this.ObjectNext=nextobject;
    }
    public void setPrevObject(ObjectBox prevobject){
        this.ObjectPrev=prevobject;
    }    
    
    
}
