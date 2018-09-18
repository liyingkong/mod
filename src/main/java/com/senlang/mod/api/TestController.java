package com.senlang.mod.api;

import com.senlang.mod.dao.t_peoplefeatureRepo;
import com.senlang.mod.model.t_peoplefeature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;


@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    private t_peoplefeatureRepo tpfr;

    private final Logger logger = LogManager.getLogger();

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "hello";
    }

//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    @ResponseBody
//    public Object getPeoplesAll() {
//        PageRequest pageable = getPageRequest();
//        Page<t_peoplefeature> data = tpfr.findAll(pageable);
//        HashMap<String, Object> ret = JsonResultFactory.getOkResult();
//        ret.put("data", data);
//        return ret;
//    }
    @RequestMapping(value = "/nameList", method = RequestMethod.GET)
    @ResponseBody
    public String getPeoplesNameAll() {
        List<t_peoplefeature> tpfl = tpfr.findAll();
        List<String> peoples = tpfl.parallelStream().map(c -> "\""+c.name+"\"").collect(Collectors.toList());
        String peoplesNameStr = "["+String.join(",", peoples.toArray(new String[peoples .size()]))+"]";
        return peoplesNameStr;
    }
}
