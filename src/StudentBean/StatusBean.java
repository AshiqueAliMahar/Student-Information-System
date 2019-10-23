/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentBean;


public class StatusBean {

    public StatusBean(int id, String status, int loginId) {
        this.id = id;
        this.status = status;
        this.loginId = loginId;
    }

    private int id;
    private String status;
    private int loginId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }
    
   
    
}
