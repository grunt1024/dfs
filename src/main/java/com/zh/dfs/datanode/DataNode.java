package com.zh.dfs.datanode;

import java.util.concurrent.TimeUnit;

/**
 * DataNode 启动类
 *
 * @author : zhanghua
 * @date : 2023/1/30
 */
public class DataNode {

	/**
	 * 启动标识
	 */
	private volatile boolean shouldRun;

	private void init(){
		this.shouldRun = true;
	}



	private void run(){
		try {
			while (shouldRun){
				TimeUnit.SECONDS.sleep(1);
				//去nameNode注册
				System.out.println("向nameNode注册,上报自身信息");

			}
		}catch (Exception e){
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		DataNode dataNode = new DataNode();
		dataNode.init();
		dataNode.run();
	}
}
