//package com.taotao.search;
//
//import java.io.IOException;
//
//import org.apache.solr.client.solrj.SolrQuery;
//import org.apache.solr.client.solrj.SolrServer;
//import org.apache.solr.client.solrj.SolrServerException;
//import org.apache.solr.client.solrj.impl.CloudSolrServer;
//import org.apache.solr.client.solrj.impl.HttpSolrServer;
//import org.apache.solr.client.solrj.response.QueryResponse;
//import org.apache.solr.common.SolrDocument;
//import org.apache.solr.common.SolrDocumentList;
//import org.apache.solr.common.SolrInputDocument;
//import org.junit.Test;
//
//public class SolrTest {
//
//	@Test
//	public void addDocument() throws Exception {
//		//创建一个连接
//		SolrServer solrServer = new HttpSolrServer("http://192.168.18.209:8080/solr");
//		//创建一个文档对象
//		SolrInputDocument document = new SolrInputDocument();
//		//向文档中添加域
//		document.addField("id", "test001");
//		document.addField("item_title", "测试商品2");
//		document.addField("item_price", 54321);
//		/*//修改则id不变，其他数据修改，如：
//		document.addField("id", "test001");
//		document.addField("item_title", "测试商品1");
//		document.addField("item_price", 12345);*/
//		//把文档添加到索引库
//		solrServer.add(document);
//		//提交
//		solrServer.commit();
//	}
//	
//	@Test
//	public void deleteDocument() throws Exception {
//		//创建一个连接
//		SolrServer solrServer = new HttpSolrServer("http://192.168.18.209:8080/solr");
////		solrServer.deleteById("test001");
//		solrServer.deleteByQuery("*:*");//删除所有
//		//提交
//		solrServer.commit();
//	}
//	
//	@Test
//	public void queryDocument() throws Exception {
//		//创建一个连接
//		SolrServer solrServer = new HttpSolrServer("http://192.168.18.209:8080/solr");
//		//创建一个查询对象
//		SolrQuery query = new SolrQuery();
//		//设置查询条件
//		query.setQuery("*:*");
//		query.setStart(20);
//		query.setRows(50);
//		//执行查询
//		QueryResponse response = solrServer.query(query);
//		//取查询结果
//		SolrDocumentList results = response.getResults();
//		long numFound = results.getNumFound();
//		if(results.size()>0){
//			System.out.println("numFound:"+numFound);
//			for (SolrDocument solrDocument : results) {
//				System.out.println(solrDocument.get("id"));
//				System.out.println(solrDocument.get("item_title"));
//			}
//		}
//		//提交
//		solrServer.commit();
//	}
//	
//	
//}
