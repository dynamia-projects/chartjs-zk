# Chart.js for ZK

This library let you use Chart.js v2.1.4 (https://github.com/chartjs/Chart.js) framework in ZK application using pure Java or ZUL. Complete Chartjs-ZK documentation at www.dynamia.tools/chartjs-zk

##Bulding

This is a regular maven project, download and build it using the following command:


```bash
mvn clean install
```

##Installation

Just add **chartjs-zk-xx.jar** to your project dependencies:

**Maven**

```xml
<dependency>
    <groupId>tools.dynamia.chartjs</groupId>
    <artifactId>chartjs-zk</artifactId>
    <version>1.0.0</version>
</dependency>
```

**Gradle**
```bash
compile "tools.dynamia.chartjs:chartjs-zk:1.0.0"
```

##Usage

From **zul**
```xml
<chartjs type="pie" title="My Charts" data="@bind(vm.chartData)"/>
```

```java
public class PieChartViewModel{
    
    public ChartjsData getChartData(){
        CategoryChartjsData chartData = new CategoryChartjsData();
        chartData.add("2014", 1030);
        chartData.add("2015", 200);
        chartData.add("2016", 3500);
        return chartData;
    }
}
```

From **java**

```java
import tools.dynamia.chartjs.*;
import org.zkoss.zul.*

public class PieChart{

    public void init(){
        Chartjs chart = new Chartjs();
        chart.setType(Chartjs.TYPE_PIE);
        chart.setTitle("My Chartjs");
        chart.setData(getChartData());
        
        Window window = new Window();
        window.appendChild(chart);
        window.doModal();
        
    }
    
    public ChartjsData getChartData(){
        CategoryChartjsData chartData = new CategoryChartjsData();
        chartData.add("2014", 1030);
        chartData.add("2015", 200);
        chartData.add("2016", 3500);
        return chartData;
    }
}
```

ChartjsData class follow the same model as **chartjs** JSON data but with helper methods. See Chartjs documentation http://www.chartjs.org/docs/



##Supported Chart Types

- bar
- horizontalBar
- line
- pie
- scatter
- doughnut
- radar
- polarArea
- bubble

##License
Chartjs-ZK is available under the [Apache 2 License](https://github.com/dynamia-projects/chartjs-zk/blob/master/LICENSE.md).

##Want contribute?
Please read [Contributing Guidelines](https://github.com/dynamia-projects/chartjs-zk/blob/master/CONTRIBUTING.md)

