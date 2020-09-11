package edu.eci.cvds.servlet.Model;

public class Todo {
    private int userId, id;
    private String title;
    private boolean completed;

    /* This method set the userId
     * @Param userId, is a Integer 
    */
    public void setUserId(int userId){
        this.userId=userId;
    }

    /* This method set the id
     * @Param id, is a Integer and represent the number of this object ¿?*/
    public void setId(int id){
        this.id=id;
    }

    /* This method set the title
     * @Param title, is a String and is the title of the object*/
    public void setTitle(String title){
        this.title=title;
    }

    /* This method set the boolean Complete 
     * @param completed, is a Boolean and said that is complete or not*/
    public void setCompleted(boolean completed){
        this.completed=completed;
    }

    /* This method return userId */
    public int getUserId(){
        return userId;
    }

    /* This method return id */
    public int getId(){
        return id;
    }

    /* This methid return title */
    public String getTitle(){
        return title;
    }

    /* This method return completed */
    public boolean getCompleted(){
        return completed;
    }
}
