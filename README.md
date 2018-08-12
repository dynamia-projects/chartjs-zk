# Chart.js for ZK

This library let you use Chart.js v2.7.2 (https://github.com/chartjs/Chart.js) framework in ZK application using pure Java or ZUL. 

Current Version: **2.7.2_R1**

## Demo
Please play with the **demo** to learn how to use the new api and all charts types.

## Bulding

This is a regular maven project, download and build it using the following command:

```bash
mvn clean install
```

## Installation

Just add **chartjs-zk-xx.jar** to your project dependencies:

**Maven**

```xml
<dependency>
    <groupId>tools.dynamia.zk.addons</groupId>
    <artifactId>chartjs-zk</artifactId>
    <version>2.7.2_R1</version>
</dependency>
```

**Gradle**
```bash
compile "tools.dynamia.zk.addons:chartjs-zk:2.7.2_R1"
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



## Supported Chart Types

 - bar
 - horizontalBar
 - line
 - pie
 - scatter
 - doughnut
 - radar
 - polarArea
 - bubble 

## What's New ?

### August 2018
- New Java API for all configurations parameters in `ChartjsOptions`
- `Dataset` now can use `Scales` (axis) from Java
- `Dataset` has all chartjs properties
- Builders for POJO Classes
- New versioning system. First 3 numbers means the Chart.js version used. Identifier `_R1` means the release number of this project.
- New GroupId `tools.dynamia.zk.addons`. We start developing new addons for zk
- Fixes and clean code
- Basic Demo

## TODO

- Perform more test
- Deploy to maven central

## License

Chartjs-ZK is available under the [Apache 2 License](https://github.com/dynamia-projects/chartjs-zk/blob/master/LICENSE.md).

## Want contribute?
Please read [Contributing Guidelines](https://github.com/dynamia-projects/chartjs-zk/blob/master/CONTRIBUTING.md)

