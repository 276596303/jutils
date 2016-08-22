package main.java.com.JUtils.hbase;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.MasterNotRunningException;
import org.apache.hadoop.hbase.ZooKeeperConnectionException;
import org.apache.hadoop.hbase.client.HBaseAdmin;

import com.google.protobuf.ServiceException;

/**
 * @author: mlc
 * @dat: 2016年8月11日
 * @Description: TODO
 */

public class HbaseTest {

	static Configuration conf = null;
	static {
		conf = HBaseConfiguration.create();
		conf.set("hbase.zookeeper.quorum", "115.29.47.18:2181");
	}

	public static void main(String[] args)
			throws MasterNotRunningException, ZooKeeperConnectionException, IOException, ServiceException {

		HBaseAdmin admin = new HBaseAdmin(conf);
		admin.listTableNames();

	}
}
