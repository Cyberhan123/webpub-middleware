/*
 * Copyright (c) 2020. 代码由Cyberhan编写，不保证其准确性，仅供参考。
 * 注意：代码不可进行商业用途，本项目遵寻Apache 2.0开源协议。
 * 本人有权对开源协议进行修改和更换。
 */

package cn.hselfweb.webpub.webpubmiddleware.controller;

import cn.hselfweb.webpub.webpubmiddleware.services.SafeService;
import cn.hselfweb.webpub.webpubmiddleware.type.AddAccessPortParam;
import cn.hselfweb.webpub.webpubmiddleware.type.DeleteDbParam;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/api/safe")
@ApiModel(value = "安全类", description = "对应前端安全")
public class SafeController {
    private SafeService safeService;

    @Autowired
    SafeController(SafeService safeService) {
        this.safeService = safeService;
    }

    /**
     * 添加放行端口
     *
     * @param addAccessPortParam
     * @return
     */
    @RequestMapping(value = "/port/add", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> addAccessPort(AddAccessPortParam addAccessPortParam) {
        return this.safeService.addAccessPort(addAccessPortParam);
    }

    /**
     * 添加屏蔽ip
     *
     * @param addAccessPortParam
     * @return
     */
    @RequestMapping(value = "/ip/ban", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> banIp(AddAccessPortParam addAccessPortParam) {
        return this.safeService.addAccessPort(addAccessPortParam);
    }


    /**
     * 获取SSH信息
     *
     * @param
     * @return
     */
    @RequestMapping(value = "/ssh", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<String> getSshInfo() {
        return this.safeService.getSshInfo();
    }

    /**
     * 修改SSH信息
     *
     * @param port
     * @return
     */
    @RequestMapping(value = "/ssh", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<String> setSshPort(String port) {
        return this.safeService.setSshPort(port);
    }

}
