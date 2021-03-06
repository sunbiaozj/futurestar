package org.zhps.base.util;


import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.Properties;

/**
 * Copyright (c) 2012 Conversant Solutions. All rights reserved.
 * <p/>
 * Created on 2016/12/21.
 */
public class PropertiesUtil {
    //market
    public static String MK_SIM_TEST;
    public static String MK_SIM_FIRM;
    public static String MK_PROD;
    public static String[] MK_CONTRACTS;
    public static int MK_SUB_NUM;
    public static String[] MK_VARIETIES;
    public static int MK_VARIETY_RM;
    public static int MK_VARIETY_RB;
    public static int MK_VARIETY_M;
    public static int MK_VARIETY_P;
    public static int MK_VARIETY_TA;
    public static int MK_VARIETY_SR;
    public static int MK_VARIETY_MA;
    public static int MK_VARIETY_FG;
    public static int MK_VARIETY_A;
    public static int MK_VARIETY_JD;
    public static int MK_VARIETY_Y;
    public static int MK_VARIETY_PP;
    public static String MK_FLOW_PATH;
    public static int MK_QUO_INSTRUMENTID;
    public static int MK_QUO_LAST_PRICE;
    public static int MK_QUO_OPEN_PRICE;
    public static int MK_QUO_HIGHEST_PRICE;
    public static int MK_QUO_LOWEST_PRICE;
    public static int MK_QUO_UPPERLIMIT_PRICE;
    public static int MK_QUO_LOWERLIMIT_PRICE;
    public static int MK_QUO_UPDATETIME;
    public static int MK_QUO_TRADINGDAY;
    public static int MK_QUO_VOLUME;
    public static int MK_QUO_INTEREST;
    public static int MK_AVE_5D;
    public static int MK_AVE_10D;
    public static String MK_ENV;
    //trader
    public static String TD_SIM_TEST;
    public static String TD_SIM_FIRM;
    public static String TD_PROD;
    public static String TD_BROKER_ID;
    public static String TD_ACCOUNT_ID;
    public static String TD_PASSWORD;
    public static String[] TD_CONTRACTS;
    public static char TD_DIRECTION_BUY;
    public static char TD_DIRECTION_SELL;
    public static char TD_OFFSET_FLAG_OPEN;
    public static char TD_OFFSET_FLAG_CLOSE;
    public static char TD_OFFSET_FLAG_CLOSE_TODAY;
    public static char TD_HEDGE_FLAG_SPECULATION;
    public static char TD_CONTINGENT_CONDITION_IMMEDIATELY;
    public static char TD_VOLUME_CONDITION_ANY;
    public static char TD_VOLUME_CONDITION_MIN;
    public static char TD_VOLUME_CONDITION_ALL;
    public static char TD_TIME_CONDITION_IOC;
    public static char TD_TIME_CONDITION_GFS;
    public static char TD_TIME_CONDITION_GFD;
    public static char TD_FORCE_CLOSE_REASON_NOT_FORCE_CLOSE;
    public static char TD_FORCE_CLOSE_REASON_LACK_DEPOSIT;
    public static char TD_ORDER_PRICE_TYPE_ANY_PRICE;
    public static char TD_ORDER_PRICE_TYPE_LIMIT_PRICE;
    public static char TD_ORDER_PRICE_TYPE_BEST_PRICE;
    public static char TD_ORDER_PRICE_TYPE_LAST_PRICE;
    public static char TD_ACTION_FLAG_DELETE;
    public static char TD_ACTION_FLAG_MODIFY;
    //kafka
    public static String BOOTSTRAP_SERVERS;
    public static String ACKS;
    public static int RETRIES;
    public static int BATCH_SIZE;
    public static int LINGER_MS;
    public static long BUFFER_MEMORY;
    public static String KEY_SERIALIZER;
    public static String VALUE_SERIALIZER;
    public static String ZOOKEEPER_QUORUM;
    public static String CONSUMER_GROUP_ID;
    public static String MK_TOPIC;
    //task interval
    public static long HOURS_24 = 24 * 60 * 60 * 1000l;
    public static long HOURS_12 = 12 * 60 * 60 * 1000l;
    public static long MINUTES_1 = 60 * 1000L;
    //task date
    public static Date OPEN_MARKET_DATE;
    public static Date CLOSE_MARKET_DATE;
    public static Date START_STRATEGY_DATE;
    //redis
    public static String REDIS_IP;
    public static int REDIS_PORT;
    public static int REDIS_POOL_TOTAL;
    public static int REDIS_POOL_IDLE;
    public static long REDIS_POOL_WAIT_MILLIS;
    public static boolean REDIS_POOL_BORROW;
    public static boolean REDIS_POOL_RETURN;
    //hbase
    public static String HBASE_ZOOKEEPER_QUORUM;
    public static String HBASE_BUFFERED_FLUSH_INTERVAL;
    public static String HBASE_BATCH_SIZE;
    public static String HBASE_TABLE_QUOTATION;
    public static String HBASE_TABLE_QUOTATION_CF;
    public static String HBASE_TABLE_CLOSE;
    public static String HBASE_TABLE_CLOSE_CF;
    public static String HBASE_TABLE_POSITION;
    public static String HBASE_TABLE_POSITION_CF;

    public static long SPARK_DURATIONS;

    static {
        Properties prop = new Properties();
        InputStream is = Objects.class.getResourceAsStream("/config.properties");
        try {
            prop.load(is);
            MK_SIM_TEST = prop.getProperty("mk_sim_test");
            MK_SIM_FIRM = prop.getProperty("mk_sim_firm");
            MK_PROD = prop.getProperty("mk_prod");
            MK_CONTRACTS = prop.getProperty("mk_contracts").split(",");
            MK_SUB_NUM = Integer.parseInt(prop.getProperty("mk_sub_num"));
            MK_VARIETIES = prop.getProperty("mk_varieties").split(",");
            MK_VARIETY_RM = Integer.parseInt(prop.getProperty("mk_variety_rm"));
            MK_VARIETY_RB = Integer.parseInt(prop.getProperty("mk_variety_rb"));
            MK_VARIETY_M = Integer.parseInt(prop.getProperty("mk_variety_m"));
            MK_VARIETY_P = Integer.parseInt(prop.getProperty("mk_variety_p"));
            MK_VARIETY_TA = Integer.parseInt(prop.getProperty("mk_variety_ta"));
            MK_VARIETY_SR = Integer.parseInt(prop.getProperty("mk_variety_sr"));
            MK_VARIETY_MA = Integer.parseInt(prop.getProperty("mk_variety_ma"));
            MK_VARIETY_FG = Integer.parseInt(prop.getProperty("mk_variety_fg"));
            MK_VARIETY_A = Integer.parseInt(prop.getProperty("mk_variety_a"));
            MK_VARIETY_JD = Integer.parseInt(prop.getProperty("mk_variety_jd"));
            MK_VARIETY_Y = Integer.parseInt(prop.getProperty("mk_variety_y"));
            MK_VARIETY_PP = Integer.parseInt(prop.getProperty("mk_variety_pp"));
            MK_FLOW_PATH = prop.getProperty("mk_flow_path");
            MK_TOPIC = prop.getProperty("mk_topic");
            MK_QUO_INSTRUMENTID = Integer.parseInt(prop.getProperty("mk_quotation_instrumentId"));
            MK_QUO_LAST_PRICE = Integer.parseInt(prop.getProperty("mk_quotation_lastPrice"));
            MK_QUO_OPEN_PRICE = Integer.parseInt(prop.getProperty("mk_quotation_openPrice"));
            MK_QUO_HIGHEST_PRICE = Integer.parseInt(prop.getProperty("mk_quotation_highestPrice"));
            MK_QUO_LOWEST_PRICE = Integer.parseInt(prop.getProperty("mk_quotation_lowestPrice"));
            MK_QUO_UPPERLIMIT_PRICE = Integer.parseInt(prop.getProperty("mk_quotation_upperLimitPrice"));
            MK_QUO_LOWERLIMIT_PRICE = Integer.parseInt(prop.getProperty("mk_quotation_lowerLimitPrice"));
            MK_QUO_UPDATETIME = Integer.parseInt(prop.getProperty("mk_quotation_updateTime"));
            MK_QUO_TRADINGDAY = Integer.parseInt(prop.getProperty("mk_quotation_tradingDay"));
            MK_QUO_VOLUME = Integer.parseInt(prop.getProperty("mk_quotation_volume"));
            MK_QUO_INTEREST = Integer.parseInt(prop.getProperty("mk_quotation_interest"));
            MK_AVE_5D = Integer.parseInt(prop.getProperty("mk_ave_5d"));
            MK_AVE_10D = Integer.parseInt(prop.getProperty("mk_ave_10d"));
            MK_ENV = prop.getProperty("mk_env");

            TD_SIM_TEST = prop.getProperty("td_sim_test");
            TD_SIM_FIRM = prop.getProperty("td_sim_firm");
            TD_PROD = prop.getProperty("td_prod");
            TD_BROKER_ID = prop.getProperty("td_broker_id");
            TD_ACCOUNT_ID = prop.getProperty("td_account_id");
            TD_PASSWORD = prop.getProperty("td_password");
            TD_CONTRACTS = prop.getProperty("td_contracts").split(",");
            TD_DIRECTION_BUY = prop.getProperty("td_direction_buy").charAt(0);
            TD_DIRECTION_SELL = prop.getProperty("td_direction_sell").charAt(0);
            TD_OFFSET_FLAG_OPEN = prop.getProperty("td_offsetFlag_open").charAt(0);
            TD_OFFSET_FLAG_CLOSE = prop.getProperty("td_offsetFlag_close").charAt(0);
            TD_OFFSET_FLAG_CLOSE_TODAY = prop.getProperty("td_offsetFlag_closeToday").charAt(0);
            TD_HEDGE_FLAG_SPECULATION = prop.getProperty("td_hedgeFlag_speculation").charAt(0);
            TD_CONTINGENT_CONDITION_IMMEDIATELY = prop.getProperty("td_contingentCondition_immediately").charAt(0);
            TD_VOLUME_CONDITION_ANY = prop.getProperty("td_volumeCondition_any").charAt(0);
            TD_VOLUME_CONDITION_MIN = prop.getProperty("td_volumeCondition_min").charAt(0);
            TD_VOLUME_CONDITION_ALL = prop.getProperty("td_volumeCondition_all").charAt(0);
            TD_TIME_CONDITION_IOC = prop.getProperty("td_timeCondition_ioc").charAt(0);
            TD_TIME_CONDITION_GFS = prop.getProperty("td_timeCondition_gfs").charAt(0);
            TD_TIME_CONDITION_GFD = prop.getProperty("td_timeCondition_gfd").charAt(0);
            TD_FORCE_CLOSE_REASON_NOT_FORCE_CLOSE = prop.getProperty("td_forceCloseReason_notForceClose").charAt(0);
            TD_FORCE_CLOSE_REASON_LACK_DEPOSIT = prop.getProperty("td_forceCloseReason_lackDeposit").charAt(0);
            TD_ORDER_PRICE_TYPE_ANY_PRICE = prop.getProperty("td_orderPriceType_anyPrice").charAt(0);
            TD_ORDER_PRICE_TYPE_LIMIT_PRICE = prop.getProperty("td_orderPriceType_limitPrice").charAt(0);
            TD_ORDER_PRICE_TYPE_BEST_PRICE = prop.getProperty("td_orderPriceType_bestPrice").charAt(0);
            TD_ORDER_PRICE_TYPE_LAST_PRICE = prop.getProperty("td_orderPriceType_lastPrice").charAt(0);
            TD_ACTION_FLAG_DELETE = prop.getProperty("td_actionFlag_delete").charAt(0);
            TD_ACTION_FLAG_MODIFY = prop.getProperty("td_actionFlag_modify").charAt(0);

            BOOTSTRAP_SERVERS = prop.getProperty("bootstrap_servers");
            ACKS = prop.getProperty("acks");
            RETRIES = Integer.parseInt(prop.getProperty("retries"));
            BATCH_SIZE = Integer.parseInt(prop.getProperty("batch_size"));
            LINGER_MS = Integer.parseInt(prop.getProperty("linger_ms"));
            BUFFER_MEMORY = Long.parseLong(prop.getProperty("buffer_memory"));
            KEY_SERIALIZER = prop.getProperty("key_serializer");
            VALUE_SERIALIZER = prop.getProperty("value_serializer");
            ZOOKEEPER_QUORUM = prop.getProperty("zookeeper_quorum");
            CONSUMER_GROUP_ID = prop.getProperty("consumer_group_id");

            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.HOUR_OF_DAY, 20);
            calendar.set(Calendar.MINUTE, 55);
            calendar.set(Calendar.SECOND, 0);
            OPEN_MARKET_DATE = calendar.getTime();

            calendar.set(Calendar.HOUR_OF_DAY, 15);
            calendar.set(Calendar.MINUTE, 30);
            calendar.set(Calendar.SECOND, 0);
            CLOSE_MARKET_DATE = calendar.getTime();

            calendar.set(Calendar.HOUR_OF_DAY, 14);
            calendar.set(Calendar.MINUTE, 59);
            calendar.set(Calendar.SECOND, 0);
            START_STRATEGY_DATE = calendar.getTime();


            REDIS_IP = prop.getProperty("redis_ip");
            REDIS_PORT = Integer.parseInt(prop.getProperty("redis_port"));
            REDIS_POOL_TOTAL = Integer.parseInt(prop.getProperty("redis_pool_total"));
            REDIS_POOL_IDLE = Integer.parseInt(prop.getProperty("redis_pool_idle"));
            REDIS_POOL_WAIT_MILLIS = Long.parseLong(prop.getProperty("redis_pool_wait_millis"));
            REDIS_POOL_BORROW = Boolean.parseBoolean(prop.getProperty("redis_pool_borrow"));
            REDIS_POOL_RETURN = Boolean.parseBoolean(prop.getProperty("redis_pool_return"));

            HBASE_ZOOKEEPER_QUORUM = prop.getProperty("hbase_zookeeper_quorum");
            HBASE_BUFFERED_FLUSH_INTERVAL = prop.getProperty("hbase_buffered_flush_interval");
            HBASE_BATCH_SIZE = prop.getProperty("hbase_batch_size");
            HBASE_TABLE_QUOTATION = prop.getProperty("hbase_table_quotation");
            HBASE_TABLE_QUOTATION_CF = prop.getProperty("hbase_table_quotation_cf");
            HBASE_TABLE_CLOSE = prop.getProperty("hbase_table_close");
            HBASE_TABLE_CLOSE_CF = prop.getProperty("hbase_table_close_cf");
            HBASE_TABLE_POSITION = prop.getProperty("hbase_table_position");
            HBASE_TABLE_POSITION_CF = prop.getProperty("hbase_table_position_cf");

            SPARK_DURATIONS = Long.valueOf(prop.getProperty("spark_durations"));

        } catch (IOException e) {
            //// TODO: 2016/12/21 add log 
            e.printStackTrace();
        }finally {
            IOUtils.closeQuietly(is);
        }
    }
}
