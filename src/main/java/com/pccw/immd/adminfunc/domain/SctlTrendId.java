package com.pccw.immd.adminfunc.domain;
// Generated Apr 25, 2018 1:46:10 PM by Hibernate Tools 5.0.6.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * SctlTrendId generated by hbm2java
 */
@Embeddable
public class SctlTrendId  implements Serializable {


     private String svcId;
     private LocalDateTime lastUpdateDate;

    public SctlTrendId() {
    }

    public SctlTrendId(String svcId, LocalDateTime lastUpdateDate) {
       this.svcId = svcId;
       this.lastUpdateDate = lastUpdateDate;
    }
   


    @Column(name="SVC_ID", nullable=false, length=50)
    public String getSvcId() {
        return this.svcId;
    }
    
    public void setSvcId(String svcId) {
        this.svcId = svcId;
    }


    @Column(name="LAST_UPDATE_DATE", nullable=false)
    public LocalDateTime getLastUpdateDate() {
        return this.lastUpdateDate;
    }
    
    public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SctlTrendId) ) return false;
		 SctlTrendId castOther = ( SctlTrendId ) other; 
         
		 return ( (this.getSvcId()==castOther.getSvcId()) || ( this.getSvcId()!=null && castOther.getSvcId()!=null && this.getSvcId().equals(castOther.getSvcId()) ) )
 && ( (this.getLastUpdateDate()==castOther.getLastUpdateDate()) || ( this.getLastUpdateDate()!=null && castOther.getLastUpdateDate()!=null && this.getLastUpdateDate().equals(castOther.getLastUpdateDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getSvcId() == null ? 0 : this.getSvcId().hashCode() );
         result = 37 * result + ( getLastUpdateDate() == null ? 0 : this.getLastUpdateDate().hashCode() );
         return result;
   }   


}


