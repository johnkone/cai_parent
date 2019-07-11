package cai.com.base.dao;

import cai.com.base.entity.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by cai on 2019/2/24.
 */
public interface LabelDao extends JpaRepository<Label,String>,JpaSpecificationExecutor<Label> {

}
