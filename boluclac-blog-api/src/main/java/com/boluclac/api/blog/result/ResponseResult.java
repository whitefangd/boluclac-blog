/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.api.blog.result;

/**
 * Response Result only access when send response for client on
 * {@link com.boluclac.api.blog.controller.BaseController BaseController}.
 * 
 * @author boluclac
 *
 */
public class ResponseResult {

    /** data response. */
    private BaseResult data;

    /**
     * get data response.
     * 
     * @return data response.
     */
    public BaseResult getData() {

        return data;
    }

    /**
     * set data response.
     * 
     * @param data
     *            data response.
     */
    public void setData(final BaseResult data) {

        this.data = data;
    }
}
