package com.example.linbin.retrofit;

import java.util.List;

/**
 * Created by Administrator on 2016/5/6.
 */
public class ProductBean {

    /**
     * respCode : 0
     * resources : [{"id":2,"leftCount":9668,"status":1,"yield":12,"name":"伯利宝理财定期一期","type":"2","recommend":5},{"id":1,"leftCount":9995,"status":1,"yield":8,"name":"伯利宝理财活期一期","type":"1","recommend":5},{"id":3,"leftCount":0,"status":3,"yield":12,"name":"伯利宝理财定期二期","type":"2","recommend":5}]
     * hasNextPage : false
     * totalCount : 3
     * respMsg : OK
     */

    private int respCode;
    private boolean hasNextPage;
    private int totalCount;
    private String respMsg;
    /**
     * id : 2
     * leftCount : 9668
     * status : 1
     * yield : 12
     * name : 伯利宝理财定期一期
     * type : 2
     * recommend : 5
     */

    private List<ResourcesBean> resources;

    public int getRespCode() {
        return respCode;
    }

    public void setRespCode(int respCode) {
        this.respCode = respCode;
    }

    public boolean isHasNextPage() {
        return hasNextPage;
    }

    public void setHasNextPage(boolean hasNextPage) {
        this.hasNextPage = hasNextPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public List<ResourcesBean> getResources() {
        return resources;
    }

    public void setResources(List<ResourcesBean> resources) {
        this.resources = resources;
    }

    public static class ResourcesBean {
        private int id;
        private int leftCount;
        private int status;
        private int yield;
        private String name;
        private String type;
        private int recommend;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getLeftCount() {
            return leftCount;
        }

        public void setLeftCount(int leftCount) {
            this.leftCount = leftCount;
        }

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public int getYield() {
            return yield;
        }

        public void setYield(int yield) {
            this.yield = yield;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getRecommend() {
            return recommend;
        }

        public void setRecommend(int recommend) {
            this.recommend = recommend;
        }
    }
}
