package org.delivery.db.account;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;
import org.delivery.db.core.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "account")
public class AccountEntity extends BaseEntity {

}
