tools.dynamia.chartjs.Chartjs = zk.$extends(zk.Widget, {
    _type: '',
    _data: '',
    _options: '',
    getType: function () {
        return this._type;
    },
    setType: function (type) {
        if (this._type != type) {
            this._type = type;
            if (this.desktop)
                this.$n().innerHTML = zUtl.encodeXML(type);
        }
    },
    getData: function () {
        return this._data;
    },
    setData: function (data) {
        if (this._data != data) {
            this._data = data;
            if (this.desktop)
                this.$n().innerHTML = zUtl.encodeXML(data);
        }
    },
    getOptions: function () {
        return this._options;
    },
    setOptions: function (options) {
        if (this._options != options) {
            this._options = options;
            if (this.desktop)
                this.$n().innerHTML = zUtl.encodeXML(options);
        }
    },
    bind_: function () {
        this.$supers(tools.dynamia.chartjs.Chartjs, 'bind_', arguments);
        var ctx = document.getElementById(this.uuid);
        if (this.getType() && this.getData()) {
            this.chart = new Chart(ctx, {
                type: this.getType(),
                data: this.getData(),
                options: this.getOptions()
            });
        }
    }

});