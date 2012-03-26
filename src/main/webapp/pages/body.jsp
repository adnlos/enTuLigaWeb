<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="cr" uri="http://java.sun.com/jstl/core" %>

<div class="container">
	<div id="centerDiv">
		<div id="rightDiv">
			<!-- Imagen principal de entuliga -->
			<div class="span5">
				<div class="imgIndex">
					<img alt="En Tu Liga" width="105px" height="165px" src="images/enTuLiga.jpg">
				</div>
				<div>
					<h2>entuliga... tu eres el protagonista</h2>
					<p>lleva a la nube tu liga y dejanos ayudate...
					tu juega y nosotros.... aprende mas</p>
				</div>				
			</div>
			<div class="span4">
				<div style="padding-top: 30px">
					<ul class="nav nav-tabs">
					  <li class="active"><a href="#homeEquipo1" id="equipo1">equipo1</a></li>
					  <li><a href="#homeEquipo2" id="equipo2">equipo2</a></li>
					  <li><a href="#homeEquipo3" id="equipo3">equipo3</a></li>
					</ul>
					 
					<div class="tab-content">
					  <div class="tab-pane active" id="equipo1Content"><p>aqui ira un div con los resultados de los equipos</p>
					  <p>aqui ira un div con los resultados de los equipos</p>
					  <p>aqui ira un div con los resultados de los equipos</p>
					  <p>aqui ira un div con los resultados de los equipos</p>
					  
					  </div>
					  <div class="tab-pane" id="equipo2Content">y si ponemos algo aqui</div>
					  <div class="tab-pane" id="equipo3Content">y si tambien colocamos algo aqui</div>
					</div>
				</div>
			</div>
			<div class="span4">
				<div style="padding-top: 30px;">
					<hr></hr>
					<div class="imgIndex">
					<img alt="En Tu Liga" width="105px" height="165px" src="images/balonNoticias.jpeg">
					</div>
					<div>
						<h2>Actopan Ganador</h2>
						<p>En el ultimo minuto del segundo tiempo
						los chingones de actopan dieron la vuelta a los 
						federales de mizquiahuacala</p>
					</div>	
					<div class="push"></div>
					<hr></hr>
				</div>
				
			</div> 						
		</div>
		<div id="div-border"></div>
		<div id="leftDiv">
			<div class="span5">
				<div>
					<div class="span5">
						<h1>Únete</h1>
<!-- 						<hr></hr> -->
						<table cellpadding="0" cellspacing="0" width="400px">
						<tr></tr>
						<tr>
							<td align="center">
								<form:form id="form-participante" method="post">
									<!-- FORMULARIO DEL PARTICIPANTE -->
									<spring:nestedPath path="participanteVo">
										<table border="0" align="center" >
											<tr>	
												<td width="150px"><spring:message code="registro.participante.usuario"></spring:message></td>
												<td><form:input path="usuarioP" size="20" maxlength="20" /></td>
											</tr>
											<tr>	
												<td><spring:message code="registro.participante.nombre"></spring:message></td>
												<td colspan="2"><form:input path="nombreP" size="20"/></td>
											</tr>
											<tr>	
												<td><spring:message code="registro.participante.aPaterno"></spring:message></td>
												<td colspan="2"><form:input path="apellidoPaternoP" size="20"/></td>
												
											</tr>
											<tr>	
												<td><spring:message code="registro.participante.aMaterno"></spring:message></td>
												<td colspan="2"><form:input path="apellidoMaternoP" size="20"/></td>
												
											</tr>
											<tr>	
												<td><spring:message code="registro.participante.email"></spring:message></td>
												<td  colspan="2">
													<form:input path="MailP" size="20" />
												</td>
											</tr>
										</table>
									</spring:nestedPath>
								</form:form>
							</td>
						</tr>
						<tr></tr>
						<tr>
							<td align="center" >
								<input type="button" value="Guardar" id="btn-guardar" class="ui-button ui-button-text-only ui-widget ui-corner-all">
								<input type="button" value="Cancelar" id="btn-cancelar" class="ui-button ui-button-text-only ui-widget  ui-corner-all">
							</td>
						</tr>
					</table>
					</div>
					
					<div class="span5">
						<div style="padding-top: 30px;">
							<div class=imgIndexIphone>
							<img alt="En Tu Liga"  src="images/iphone.jpg">
							</div>
							<div>
								<h2>En tu movil</h2>
								<p>Conoce nuestros clientes para los diferentes dispositivos</p>
							</div>	
						</div>
					</div>	
					<div class="span5">
						<ul class="nav nav-pills">
					<li class="active"><a href="#">Regular link</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#"> Dropdown <b class="caret" />
					</a>
						<ul id="menu1" class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li class="divider" />
							<li><a href="#">Separated link</a></li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#"> Dropdown 2 <b class="caret" />
					</a>
						<ul id="menu2" class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li class="divider" />
							<li><a href="#">Separated link</a></li>
						</ul></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#"> Dropdown 3 <b class="caret" />
					</a>
						<ul id="menu3" class="dropdown-menu">
							<li><a href="#">Action</a></li>
							<li><a href="#">Another action</a></li>
							<li><a href="#">Something else here</a></li>
							<li class="divider" />
							<li><a href="#">Separated link</a></li>
						</ul></li>
				</ul>
					</div>	
				</div>
			</div>	
		</div>
	</div>
</div>
