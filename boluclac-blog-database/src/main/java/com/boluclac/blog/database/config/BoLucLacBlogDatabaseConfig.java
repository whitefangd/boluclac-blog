/**
 * Bo Luc Lac Blog. (2018)
 * 
 * @author boluclac (Le Thanh Dung)
 */
package com.boluclac.blog.database.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Config database for boluclac-blog.<br>
 * Configuration using JPA.
 * <ul>
 * <li>1. Entity scan <i>{@link com.boluclac.blog.database.entities}</i></li>
 * <li>1. JPA Repositories
 * <i>{@link com.boluclac.blog.database.repositories}</i></li>
 * </ul>
 * 
 * @author boluclac
 *
 */
@Configuration
@EntityScan("com.boluclac.blog.database.entities")
@EnableJpaRepositories("com.boluclac.blog.database.repositories")
public class BoLucLacBlogDatabaseConfig {

}
