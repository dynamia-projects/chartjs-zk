tools.dynamia.zk.addons.chartjs.Chartjs = zk.$extends(zk.Widget, {

    _type: '',
    _data: '',
    _options: '',
    getType: function () {
        return this._type;
    },
    setType: function (type) {
        if (this._type != type) {
            this._type = type;
        }
    },
    getData: function () {
        return this._data;
    },
    setData: function (data) {
        if (this._data != data) {
            if (this.chart) {
                this._data.labels = data.labels;
                this._data.datasets = data.datasets;
                this.chart.update();
            }else{
                this._data = data;
            }
        }
    },
    getOptions: function () {
        return this._options;
    },
    setOptions: function (options) {
        if (this._options != options) {
            this._options = options;
            if(this.chart){
                this.chart.options = this._options;
                this.chart.update();
            }
        }
    },
    bind_: function () {
        this.$supers(tools.dynamia.zk.addons.chartjs.Chartjs, 'bind_', arguments);
        var ctx = document.getElementById(this.uuid+'canvas');
        if (this.getType() && this.getData()) {
            this.chart = new Chart(ctx, {
                type: this.getType(),
                data: this.getData(),
                options: this.getOptions()
            });
        }
    },
    unbind_: function () {
        this.$supers(tools.dynamia.zk.addons.chartjs.Chartjs, 'unbind_', arguments);
    }
});