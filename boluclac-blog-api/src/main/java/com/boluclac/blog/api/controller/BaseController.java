/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.boluclac.blog.api.result.BaseResult;
import com.boluclac.blog.api.result.ResponseResult;

/**
 * base controller.<br>
 * support send response for client. <br>
 * Response data will be converted to JSON data.
 * <table>
 * <tr>
 * <th>Status key</th>
 * <th>Description</th>
 * </tr>
 * <tr>
 * <td>{@link HttpStatus#OK}</td>
 * <td>200 response OK</td>
 * </tr>
 * <tr>
 * <td>{@link HttpStatus#BAD_REQUEST}</td>
 * <td>400 response when have error logic</td>
 * </tr>
 * <tr>
 * <td>{@link HttpStatus#INTERNAL_SERVER_ERROR}</td>
 * <td>500 response when have error don't control</td>
 * </tr>
 * </table>
 * 
 * @author boluclac
 *
 */
public class BaseController {

    /**
     * send response client with status {@link HttpStatus#OK OK(200)}.
     * 
     * @param result
     *            data result when want send response client
     * 
     * @return response data. it will is converted to JSON data for client
     */
    protected ResponseEntity<ResponseResult> ok(final BaseResult result) {

        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(result);
        return ResponseEntity.status(HttpStatus.OK).body(responseResult);
    }

    /**
     * send response client with status {@link HttpStatus#OK OK(200)}.
     * 
     * @return response data. it will is converted to JSON data for client
     */
    protected ResponseEntity<ResponseResult> ok() {

        ResponseResult responseResult = new ResponseResult();
        responseResult.setData(null);
        return ResponseEntity.status(HttpStatus.OK).body(responseResult);
    }
}
