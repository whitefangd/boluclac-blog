export default ({ app, Vue }) => {
  Vue.mixin({
    methods: {
      httpGet(url, data) {
        return this.axiosHttpGet(url, data).then(function(response) {
          if (response.data) {
            var responseData = response.data;
            if (responseData.data) {
              return responseData.data;
            }
          }
        });
      },
      httpPost(url, data) {
        return this.axiosHttpPost(url, data);
      },
      httpPut(url, data) {
        return this.axiosHttpPut(url, data);
      },
      httpDelete(url, data) {
        return this.axiosHttpDelete(url, data);
      }
    }
  });
};
