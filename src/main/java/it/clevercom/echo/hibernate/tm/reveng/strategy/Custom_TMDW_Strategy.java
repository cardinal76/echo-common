package it.clevercom.echo.hibernate.tm.reveng.strategy;

import org.hibernate.cfg.reveng.DelegatingReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.ReverseEngineeringStrategy;
import org.hibernate.cfg.reveng.TableIdentifier;

public class Custom_TMDW_Strategy extends DelegatingReverseEngineeringStrategy {

	public Custom_TMDW_Strategy(ReverseEngineeringStrategy delegate) {
		super(delegate);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see org.hibernate.cfg.reveng.DelegatingReverseEngineeringStrategy#columnToPropertyName(org.hibernate.cfg.reveng.TableIdentifier, java.lang.String)
	 */
	@Override
	public String columnToPropertyName(TableIdentifier table, String column) {
		// TODO Auto-generated method stub
		return super.columnToPropertyName(table, column);
	}

	/* (non-Javadoc)
	 * @see org.hibernate.cfg.reveng.DelegatingReverseEngineeringStrategy#tableToClassName(org.hibernate.cfg.reveng.TableIdentifier)
	 */
	@Override
	public String tableToClassName(TableIdentifier tableIdentifier) {
		String tableName = super.tableToClassName(tableIdentifier);
		//System.out.println("Generating Class => " + tableName.replace("Tm", ""));
		return tableName.replace("Tm", "");
	}
}
