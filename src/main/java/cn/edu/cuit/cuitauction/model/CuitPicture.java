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
public class CuitPicture implements Serializable {

    private static final long serialVersionUID = -6937495721584525245L;
	@Id
	@GeneratedValue
   	private Integer id;
	private String pictureName;
	private String pictureUrl;
	private String pictureType;
	private Integer cuitCommodityId;
}