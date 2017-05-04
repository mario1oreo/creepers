package com.fosun.fc.projects.creepers.pipeline;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
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
 * @since 2017-1-16 15:32:30
 * @see
 */
public class HtmlToJsonFilePipline extends FilePipeline {

    private Logger logger = LoggerFactory.getLogger(getClass());

    public HtmlToJsonFilePipline() {
        setPath("/data/webmagic/");
    }

    public HtmlToJsonFilePipline(String path) {
        setPath(path);
    }
    
    @Override
    public void process(ResultItems resultItems, Task task) { 
        String path = "/image/tianyancha"+ PATH_SEPERATOR;
        try {
            String jsonFileName = resultItems.get(BaseConstant.JSON_FILE_NAME);
            String filename;
            if (StringUtils.isNotBlank(jsonFileName)) {
                filename = path + jsonFileName + ".json";
            } else {
                return;
            }
            PrintWriter printWriter = new PrintWriter(new FileWriter(getFile(filename)));
            printWriter.write(JSON.toJSONString(resultItems));
            printWriter.close();
        } catch (IOException e) {
            logger.warn("write file error", e);
        }
    }
}
