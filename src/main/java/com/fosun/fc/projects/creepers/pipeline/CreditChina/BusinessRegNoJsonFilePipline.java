package com.fosun.fc.projects.creepers.pipeline.CreditChina;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fosun.fc.projects.creepers.constant.BaseConstant;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.FilePipeline;

/** 
 * 
 *<p>
 *将爬取结果写入Text文本中:
 *</p>
 * @author maxin
 * @since 2017-3-22 02:44:50
 * @see
 */
public class BusinessRegNoJsonFilePipline extends FilePipeline {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public BusinessRegNoJsonFilePipline() {
        setPath("/data/webmagic/");
    }

    public BusinessRegNoJsonFilePipline(String path) {
        setPath(path);
    }
    
    
    @Override
    public void process(ResultItems resultItems, Task task) {
        logger.info("========================>>BusinessRegNoJsonFilePipline:  start");
        String path = "/image/businessRegNo"+ PATH_SEPERATOR;
        try {
            String jsonFileName = resultItems.get(BaseConstant.JSON_FILE_NAME);
            String filename;
            if (StringUtils.isNotBlank(jsonFileName)) {
                filename = path + jsonFileName + ".json";
            } else {
                return;
            }
            String content = resultItems.get(BaseConstant.RESULT_DATA_KEY);
            PrintWriter printWriter = new PrintWriter(new FileWriter(getFile(filename)));
            printWriter.write(content);
            printWriter.close();
            logger.info("========================>>filename:"+filename);
        } catch (IOException e) {
            logger.warn("write file error", e);
        }
        logger.info("========================>>BusinessRegNoJsonFilePipline:  end!");
    }
}
