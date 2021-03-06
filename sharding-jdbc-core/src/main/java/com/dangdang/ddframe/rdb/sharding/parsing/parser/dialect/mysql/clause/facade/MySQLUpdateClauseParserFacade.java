package com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.mysql.clause.facade;

import com.dangdang.ddframe.rdb.sharding.api.rule.ShardingRule;
import com.dangdang.ddframe.rdb.sharding.parsing.lexer.LexerEngine;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.clause.facade.AbstractUpdateClauseParserFacade;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.clause.UpdateSetItemsClauseParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.clause.WhereClauseParser;
import com.dangdang.ddframe.rdb.sharding.parsing.parser.dialect.mysql.clause.MySQLTableReferencesClauseParser;

/**
 * Update clause parser facade for MySQL.
 *
 * @author zhangliang
 */
public final class MySQLUpdateClauseParserFacade extends AbstractUpdateClauseParserFacade {
    
    public MySQLUpdateClauseParserFacade(final ShardingRule shardingRule, final LexerEngine lexerEngine) {
        super(new MySQLTableReferencesClauseParser(shardingRule, lexerEngine), new UpdateSetItemsClauseParser(lexerEngine), new WhereClauseParser(lexerEngine));
    }
}
