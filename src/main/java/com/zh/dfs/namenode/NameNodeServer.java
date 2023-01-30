package com.zh.dfs.namenode;

/**
 * NameNode 核心启动类
 * @author : zhanghua
 * @date : 2023/1/30
 */

public class NameNodeServer {

	private volatile boolean shouldRun;

	public NameNodeServer(){
		this.shouldRun = true;
	}

	public void init(){

	}

	private void run(){
		try {
			while(shouldRun) {
				Thread.sleep(1000);
				System.out.println("监听dataNode注册信息...维护一张 dataNodes 列表");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public static void main(String[] args) {
		System.out.println("name node starting ");
		NameNodeServer nameNodeServer = new NameNodeServer();
		nameNodeServer.init();
		nameNodeServer.run();
	}
}
