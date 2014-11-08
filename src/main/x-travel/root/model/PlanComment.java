package root.model;

import root.controller.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;


/**
 * Created by i843719 on 10/31/14.
 */
@Entity
public class PlanComment implements Serializable {

    private static final long serialVersionUID = 8500830544382714685L;

    @Id
    @GeneratedValue
    private int PlanCommentId;

    public int getPlanCommentId() {
        return PlanCommentId;
    }

    public void setPlanCommentId(int planCommentId) {
        PlanCommentId = planCommentId;
    }

    @ManyToOne
    private Plan plan;

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }


    @ManyToOne
    private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private String planCommentContent;

    public String getPlanCommentContent() {
        return planCommentContent;
    }

    public void setPlanCommentContent(String planCommentContent) {
        this.planCommentContent = planCommentContent;
    }

}
