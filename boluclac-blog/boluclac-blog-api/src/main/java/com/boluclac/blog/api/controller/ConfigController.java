/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boluclac.blog.api.logic.ConfigLogic;
import com.boluclac.blog.api.result.ConfigResult;
import com.boluclac.blog.api.result.ResponseResult;

/**
 * Controller get configuration for client.
 * 
 * @author boluclac
 *
 */
@RestController
@RequestMapping("/config")
public class ConfigController extends BaseController {

    /** configuration logic. */
    @Autowired
    private ConfigLogic logic;

    /**
     * get configuration for client.
     * 
     * @return Configuration
     */
    @GetMapping
    public ResponseEntity<ResponseResult> index() {

        ConfigResult result = new ConfigResult();
        result.setLanguages(logic.generateLanguages());
        return ok(result);
    }
}
