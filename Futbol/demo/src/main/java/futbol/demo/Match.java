package futbol.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Match {
    
    @Autowired
    @Qualifier("osasuna")
    private Team homeTeam;
    
    @Autowired
    @Qualifier("erreala")
    private Team visitorTeam;
    
    @Autowired
    @Qualifier("undiano")
    private Referee referee;
    
    @Autowired
    private Home stadium;

    private Date date;
    private int homeGoal;
    private int visitorGoal;


    public Match() {
    }

    public String outcome(){
        return homeTeam.getName() + " " + homeGoal + " - " + visitorGoal + " "+ visitorTeam.getName();
    }


    public Team getHomeTeam() {
        return this.homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getVisitorTeam() {
        return this.visitorTeam;
    }

    public void setVisitorTeam(Team visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    public Referee getReferee() {
        return this.referee;
    }

    public void setReferee(Referee referee) {
        this.referee = referee;
    }

    public Home getStadium() {
        return this.stadium;
    }

    public void setStadium(Home stadium) {
        this.stadium = stadium;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getHomeGoal() {
        return this.homeGoal;
    }

    public void setHomeGoal(int homeGoal) {
        this.homeGoal = homeGoal;
    }

    public int getVisitorGoal() {
        return this.visitorGoal;
    }

    public void setVisitorGoal(int visitorGoal) {
        this.visitorGoal = visitorGoal;
    }

    @Override
    public String toString() {
        return "[" +
            " homeTeam='" + getHomeTeam() + "'" +
            ", visitorTeam='" + getVisitorTeam() + "'" +
            ", referee='" + getReferee() + "'" +
            ", stadium='" + getStadium() + "'" +
            ", date='" + getDate() + "'" +
            ", homeGoal='" + getHomeGoal() + "'" +
            ", visitorGoal='" + getVisitorGoal() + "'" +
            "\n]";
    }

}
