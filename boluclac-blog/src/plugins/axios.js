import axios from "axios";
import constant from "@/common/const";

const querystring = require("querystring");

const URL = constant.URL;

export default ({ Vue }) => {
  Vue.prototype.$axios = axios;
  Vue.mixin({
    methods: {
      httpGet(url, data) {
        var params = "";
        if (data) {
          params = "?" + querystring.stringify(data);
        }
        var requestUrl = url + params;
        return this.$axios.get(URL.BASE + requestUrl).then(function(response) {
          if (response.data) {
            var responseData = response.data;
            if (responseData.data) {
              return responseData.data;
            }
          }
        });
      },
      httpPost(url, data) {
        return this.$axios.post(URL.BASE + url, data);
      },
      httpPut(url, data) {
        return this.$axios.put(URL.BASE + url, data);
      },
      httpDelete(url, data) {
        var params = "";
        if (data) {
          params = "?" + querystring.stringify(data);
        }
        var requestUrl = url + params;
        return this.$axios.delete(URL.BASE + requestUrl);
      }
    }
  });
};
