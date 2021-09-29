package scu.debate.service.argumentValidate;

import org.springframework.stereotype.Service;
import scu.debate.dao.entity.Arguement;

@Service
public class ArgumentValidation {

    public boolean argumentValidate(Arguement arguement) {
        return true;
    }

    public boolean topicValidate(String topic) {
        return !(null == topic || topic.length() <= 0 || topic.length() >= 50);
    }
}
