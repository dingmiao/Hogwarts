package scu.debate.dao.DAO;

import org.springframework.stereotype.Repository;
import scu.debate.dao.entity.Arguement;

@Repository
public interface ArguementDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Arguement record);

    int insertSelective(Arguement record);

    Arguement selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Arguement record);

    int updateByPrimaryKey(Arguement record);

    Arguement queryArguementDOLimit1(Arguement arguement);
}