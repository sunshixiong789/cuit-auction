package cn.edu.cuit.cuitauction.dao;

import cn.edu.cuit.cuitauction.model.CuitUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ApplicationPower.
 * @author sunshixiong on 2018/01/30.
 */
public interface CuitUserDao extends JpaRepository<CuitUser,Integer> {
}