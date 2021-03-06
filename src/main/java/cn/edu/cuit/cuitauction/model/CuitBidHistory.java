package cn.edu.cuit.cuitauction.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;


/**
 * Table:
 * @author sunshixiong on 2018/01/30.
 */
@Entity
@Data
public class CuitBidHistory implements Serializable {

    private static final long serialVersionUID = -8640213901174406658L;
	@Id
	@GeneratedValue
   	private Integer id;
	private String cuitBidHistorycol;
	private Integer cuitCommodityId;
}